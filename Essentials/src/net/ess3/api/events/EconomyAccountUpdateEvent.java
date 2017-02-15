package net.ess3.api.events;

import com.earth2me.essentials.CommandSource;
import com.earth2me.essentials.User;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.math.BigDecimal;

/**
 * Event called when a user's account's balance is updated by the /eco command.
 * This event will not be called for standard transactions via /pay.
 */
public class EconomyAccountUpdateEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final CommandSource source;
    private final User user;
    private final BigDecimal originalBalance;
    private final BigDecimal newBalance;

    public EconomyAccountUpdateEvent(CommandSource source, User user, BigDecimal originalBalance, BigDecimal newBalance) {
        this.source = source;
        this.user = user;
        this.originalBalance = originalBalance;
        this.newBalance = newBalance;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * @return The CommandSource that executed the account update command. May be null.
     */
    public CommandSource getSource() {
        return source;
    }

    public User getUser() {
        return user;
    }

    public BigDecimal getOriginalBalance() {
        return originalBalance;
    }

    public BigDecimal getNewBalance() {
        return newBalance;
    }
}
