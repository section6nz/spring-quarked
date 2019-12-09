package nz.section6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @GetMapping("/year/{lowerBound}/{higherBound}")
    public Iterable<Book> findAllBetweenYears(@PathVariable int lowerBound, @PathVariable int higherBound) {
        return bookRepository.getBooksByPublicationYearBetween(lowerBound, higherBound);
    }
}
