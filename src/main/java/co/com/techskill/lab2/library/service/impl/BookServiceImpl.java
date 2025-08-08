package co.com.techskill.lab2.library.service.impl;

import co.com.techskill.lab2.library.config.BookMapper;
import co.com.techskill.lab2.library.config.BookMapperImpl;
import co.com.techskill.lab2.library.domain.dto.BookDTO;
import co.com.techskill.lab2.library.repository.IBookRepository;
import co.com.techskill.lab2.library.service.IBookService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BookServiceImpl implements IBookService {
    private final IBookRepository bookRepository;
    private final BookMapper bookMapper;


    public BookServiceImpl(IBookRepository bookRepository){
        this.bookRepository = bookRepository;
        this.bookMapper = new BookMapperImpl();

    }




}
