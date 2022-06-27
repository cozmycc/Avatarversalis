package net.avatarverse.avatarversalis.bending.listener.ability;

import net.avatarverse.avatarversalis.core.event.ability.AbilityStartEvent;
import net.avatarverse.avatarversalis.bending.listener.Listener;

import edu.umd.cs.findbugs.annotations.DefaultAnnotation;
import edu.umd.cs.findbugs.annotations.NonNull;

@DefaultAnnotation(NonNull.class)
@FunctionalInterface
public interface AbilityStartListener extends Listener {
	void onAbilityStart(AbilityStartEvent event);
}
