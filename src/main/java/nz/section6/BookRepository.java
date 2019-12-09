package nz.section6;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer> {

    List<Book> getBooksByPublicationYearBetween(int lowerBound, int upperBound);

}
