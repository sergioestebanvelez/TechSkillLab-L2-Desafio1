package co.com.techskill.lab2.library.service;

import co.com.techskill.lab2.library.domain.dto.BookDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IBookService {
    /*
    Por debajo, implementan Publisher <T>
    * Flux<?>: O a N elementos
    * Mono<?>: 0 o 1 elementos
    *
    Otros elementos que forman parte:
    Subscriber<T>: Consumo de datos - doOnNext(), etc
    Suscription<T>: limitRate()
    */
    Flux<BookDTO> findAll();
    Mono<BookDTO> findById(String id);
    Mono<BookDTO> save(BookDTO bookDTO);

}
