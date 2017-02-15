package net.ess3.api.events;

import com.earth2me.essentials.User;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.math.BigDecimal;

/**
 * Event called when a player pays another player.
 */
public class EconomyTransactionEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final User sender;
    private final User recipient;
    private final BigDecimal amount;

    public EconomyTransactionEvent(User sender, User recipient, BigDecimal amount) {
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public User getSender() {
        return sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getSenderBalance() {
        return sender.getMoney();
    }

    public BigDecimal getRecipientBalance() {
        return recipient.getMoney();
    }
}
