package net.engineering.ticketApp.Controller;

import net.engineering.ticketApp.Entry.Ticket;
import net.engineering.ticketApp.Service.TicketService;
import net.engineering.ticketApp.dto.TicketRequest;
import net.engineering.ticketApp.dto.TicketUpdateRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    private final TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    //Create
    @PostMapping
    public ResponseEntity<Ticket> create(@RequestBody TicketRequest request){
        Ticket ticket =  ticketService.createTicket(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(ticket);
    }
    // Get All
    @GetMapping
    public ResponseEntity<List<Ticket>> getAll(){
        List<Ticket> tickets = ticketService.getAllTickets();
        return ResponseEntity.ok(tickets);
    }
    //Get by ID
    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getById(@PathVariable String id){
        Ticket ticket = ticketService.getTicketById(id);
        if(ticket==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(ticket);
    }
    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Ticket> update(@PathVariable String id, @RequestBody TicketUpdateRequest request){
        Ticket updatedTicket =  ticketService.updateTicket(id, request);
        if(updatedTicket == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(updatedTicket);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id){
        String result = ticketService.deleteTicket(id);
        return ResponseEntity.ok(result);


    }



}
