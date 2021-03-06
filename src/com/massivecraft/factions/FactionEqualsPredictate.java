package com.massivecraft.factions;

import java.io.Serializable;

import org.bukkit.command.CommandSender;

import com.massivecraft.factions.entity.FPlayer;
import com.massivecraft.factions.entity.Faction;
import com.massivecraft.mcore.Predictate;

public class FactionEqualsPredictate implements Predictate<CommandSender>, Serializable
{
	private static final long serialVersionUID = 1L;
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	private final String factionId;
	public String getFactionId() { return this.factionId; }
	
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public FactionEqualsPredictate(Faction faction)
	{
		this.factionId = faction.getId();
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public boolean apply(CommandSender sender)
	{
		FPlayer fplayer = FPlayer.get(sender);
		return this.factionId.equals(fplayer.getFactionId());
	}

}