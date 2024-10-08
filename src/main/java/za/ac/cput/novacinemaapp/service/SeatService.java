package za.ac.cput.novacinemaapp.service;
/*SeatService.java
Entity for Seat service
Author: Daanyaal Isaacs (220094934)
Date: 19 May
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.novacinemaapp.domain.Seat;
import za.ac.cput.novacinemaapp.repository.SeatRepository;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SeatService implements ISeatService{
    private SeatRepository repository;
    @Autowired
    SeatService(SeatRepository repository){
        this.repository = repository;
    }

    @Override
    public Seat create(Seat seat) {
        return repository.save(seat);
    }

    @Override
    public Seat read(Long seatID) {
        return repository.findSeatBySeatID(seatID);
    }

    @Override
    public Seat update(Seat seat) {
        return repository.save(seat);
    }

    @Override
    public Set<Seat> getAll() {
        return repository.findAll().stream().collect(Collectors.toSet());
    }
}
