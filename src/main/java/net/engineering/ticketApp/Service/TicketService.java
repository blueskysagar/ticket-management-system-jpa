package net.engineering.ticketApp.Service;

import net.engineering.ticketApp.Entry.Ticket;
import net.engineering.ticketApp.Entry.TicketStatus;
import net.engineering.ticketApp.Repository.TicketRepository;
import net.engineering.ticketApp.dto.TicketRequest;
import net.engineering.ticketApp.dto.TicketUpdateRequest;
import net.engineering.ticketApp.mapper.TicketMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;
    private final TicketMapper ticketMapper;
    public TicketService(TicketRepository ticketRepository, TicketMapper ticketMapper){
        this.ticketRepository = ticketRepository;
        this.ticketMapper = ticketMapper;

    }

    public Ticket createTicket(TicketRequest request) {
        Ticket ticket = new Ticket();
        ticket.setTitle(request.getTitle());
        ticket.setDescription(request.getDescription());
        ticket.setPriority(request.getPriority());
        ticket.setStatus(TicketStatus.NEW);
        return ticketRepository.save(ticket);
    }




    public List<Ticket> getAllTickets(){
        return ticketRepository.findAll();
    }
    public Ticket getTicketById(String id ){
        return (ticketRepository.findById(id).orElseThrow(() -> new RuntimeException("Ticket not found")));

    }
    public Ticket updateTicket(String id, TicketUpdateRequest request){
        Ticket existing = getTicketById(id);
        ticketMapper.updateTicketFromDto(request, existing);
        existing.setUpdatedAt(LocalDateTime.now());
        return ticketRepository.save(existing);

     }
        public String deleteTicket(String id){
        ticketRepository.deleteById(id);
            return "Ticket Deleted successfully";
        }

    }



