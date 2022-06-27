package net.avatarverse.avatarversalis.bending.listener.world;

import net.avatarverse.avatarversalis.core.event.world.WorldSunsetEvent;
import net.avatarverse.avatarversalis.bending.listener.Listener;

import edu.umd.cs.findbugs.annotations.DefaultAnnotation;
import edu.umd.cs.findbugs.annotations.NonNull;

@DefaultAnnotation(NonNull.class)
@FunctionalInterface
public interface WorldSunsetListener extends Listener {
	void onWorldSunset(WorldSunsetEvent event);
}
