package io.milton.cloud.server.sync.push;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author brad
 */
public interface ChannelListener {

    /**
     * Called on receipt of a message from the channel
     *
     * @param msg
     */
    void handleNotification( UUID sourceId, Serializable msg );

    void memberRemoved(UUID sourceId);

    /**
     * Called when we get a connection to the hub
     */
    void onConnect();

}
