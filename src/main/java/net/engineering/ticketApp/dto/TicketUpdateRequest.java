package net.engineering.ticketApp.dto;

import net.engineering.ticketApp.Entry.TicketPriority;
import net.engineering.ticketApp.Entry.TicketStatus;

public class TicketUpdateRequest {
    private String title;
    private String description;
    private TicketPriority priority;
    private TicketStatus status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TicketPriority getPriority() {
        return priority;
    }

    public void setPriority(TicketPriority priority) {
        this.priority = priority;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }
}
