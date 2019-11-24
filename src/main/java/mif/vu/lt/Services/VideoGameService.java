package mif.vu.lt.Services;

import java.util.List;

import mif.vu.lt.DomainModels.Videogame;
import mif.vu.lt.RepositoryInterfaces.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VideoGameService {

    @Autowired
    private VideoGameRepository repository;

    public List<Videogame> listAll() {
        return repository.findAll();
    }

    public void save(Videogame videogame) {
        repository.save(videogame);
    }

    public Videogame get(Long id) {
        return repository.findById(id).get();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
