package mif.vu.lt.RepositoryInterfaces;

import mif.vu.lt.DomainModels.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoGameRepository extends JpaRepository<Videogame, Long>  {

}
