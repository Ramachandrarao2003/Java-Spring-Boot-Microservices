package com.nt.service;

import java.util.List;

import com.nt.entity.IPLPlayer;

public interface IPLPlayerMgmtService {
	public String registerPlayer(IPLPlayer player);
	public IPLPlayer findPlayerById(int id);
	public List<IPLPlayer> findAllPlayers();

}
