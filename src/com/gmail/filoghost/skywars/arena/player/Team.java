/*
 * Copyright (c) 2020, Wild Adventure
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holder nor the names of its
 *    contributors may be used to endorse or promote products derived from
 *    this software without specific prior written permission.
 * 4. Redistribution of this software in source or binary forms shall be free
 *    of all charges or fees to the recipient of this software.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package com.gmail.filoghost.skywars.arena.player;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.inventory.meta.FireworkMeta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Team {
	
	@Getter private final String id;
	@Getter private final TeamColor teamColor; // null se i giocatori sono in singolo
	@Getter private final Location spawnPoint;
	
	public ChatColor getChatColor() {
		if (teamColor != null) {
			return teamColor.getChatColor();
		} else {
			return ChatColor.WHITE;
		}
	}
	
	private static FireworkMeta NEUTRAL_FIREWORK_META = TeamColor.makeFireworkMeta(Color.fromRGB(255, 255, 255));

	public FireworkMeta getWinningFireworkMeta() {
		if (teamColor != null) {
			return teamColor.getWinningFireworkMeta();
		} else {
			return NEUTRAL_FIREWORK_META;
		}
	}

	public String getNamePluralCapitalized() {
		if (teamColor != null) {
			return teamColor.getNamePluralCapitalized();
		} else {
			return "???";
		}
	}

	public String getNameSingular() {
		if (teamColor != null) {
			return teamColor.getNameSingular();
		} else {
			return "???";
		}
	}

	public int getWoolColor() {
		if (teamColor != null) {
			return teamColor.getWoolColor();
		} else {
			return 0;
		}
	}
	
}
