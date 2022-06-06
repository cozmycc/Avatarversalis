package net.avatarverse.avatarversalis.config;

import java.util.HashSet;
import java.util.Set;

import org.spongepowered.configurate.CommentedConfigurationNode;

import lombok.Getter;

public final class ConfigManager {

	static final Set<AbilityConfig> ABILITY_CONFIGS = new HashSet<>();

	@Getter private CommentedConfigurationNode config;

}