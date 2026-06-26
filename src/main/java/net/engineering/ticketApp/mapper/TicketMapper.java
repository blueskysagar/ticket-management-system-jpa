package net.engineering.ticketApp.mapper;

import ch.qos.logback.core.model.ComponentModel;
import net.engineering.ticketApp.dto.TicketUpdateRequest;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import net.engineering.ticketApp.Entry.Ticket;

@Mapper(componentModel = "spring")
public interface TicketMapper {
@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    public void updateTicketFromDto(TicketUpdateRequest dto, @MappingTarget Ticket entity);


}


