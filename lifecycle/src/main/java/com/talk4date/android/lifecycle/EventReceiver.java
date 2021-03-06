package com.talk4date.android.lifecycle;

/**
 * A receiver of events.
 *
 * @param <T> The type of events received by this event receiver.
 */
public interface EventReceiver<T> {

	/**
	 * Notifies the receiver about a new event.
	 * @param event The event.
	 */
	void postEvent(T event);
}