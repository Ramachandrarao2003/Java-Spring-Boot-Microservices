package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nt.Project5IplTeamServiceApplication;
import com.nt.entity.IPLTeam;
import com.nt.repository.IPLTeamRepository;

import lombok.extern.slf4j.Slf4j;

@Service("IPLTeamService")
@Slf4j
public class IPLTeamMgmtServiceImpl implements IPLTeamMgmtService {

    private final Project5IplTeamServiceApplication project5IplTeamServiceApplication;
	@Autowired
	private IPLTeamRepository teamRepo;

    IPLTeamMgmtServiceImpl(Project5IplTeamServiceApplication project5IplTeamServiceApplication) {
        this.project5IplTeamServiceApplication = project5IplTeamServiceApplication;
    }

	@Override
	public String registerIPLTeam(IPLTeam team) {
		log.info("registerIPLTeam method (service)");
		int idVal=teamRepo.save(team).getTeamid();
		return "IPLTeam is saved with id value:"+idVal;
	}

	@Override
	public List<IPLTeam> getAllTeams() {
		log.info("getAllTeams method (service)");
		return teamRepo.findAll();
	}

	@Override
	public IPLTeam getTeamById(int teamId) {
		log.info("getTeamById(-) method (service)");
		return teamRepo.findById(teamId).orElseThrow(()->new IllegalArgumentException("invalid team id"));
	}

}
