package net.avatarverse.avatarversalis.bending.listener.user;

import net.avatarverse.avatarversalis.core.event.user.UserBindCopyEvent;
import net.avatarverse.avatarversalis.bending.listener.Listener;

import edu.umd.cs.findbugs.annotations.DefaultAnnotation;
import edu.umd.cs.findbugs.annotations.NonNull;

@DefaultAnnotation(NonNull.class)
@FunctionalInterface
public interface UserBindCopyListener extends Listener {
	void onUserBindCopy(UserBindCopyEvent event);
}
