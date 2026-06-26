package net.engineering.ticketApp.Repository;

import net.engineering.ticketApp.Entry.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {
}
