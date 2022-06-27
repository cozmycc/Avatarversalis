package net.avatarverse.avatarversalis.bukkit.event.ability;

import net.avatarverse.avatarversalis.core.game.ability.AbilityInstance;
import net.avatarverse.avatarversalis.core.game.user.User;

import edu.umd.cs.findbugs.annotations.DefaultAnnotation;
import edu.umd.cs.findbugs.annotations.NonNull;

@DefaultAnnotation(NonNull.class)
public class AbilityConfigLoadEvent extends AbilityEvent implements net.avatarverse.avatarversalis.core.event.ability.AbilityConfigLoadEvent {
	public AbilityConfigLoadEvent(User user, AbilityInstance ability) {
		super(user, ability);
	}
}
