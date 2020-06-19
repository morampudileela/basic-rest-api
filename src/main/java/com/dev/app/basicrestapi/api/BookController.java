package com.dev.app.basicrestapi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.app.basicrestapi.book.dao.Book;
import com.dev.app.basicrestapi.book.service.BookService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class BookController {

	
	@Autowired
	BookService bookService;
	@GetMapping("greet")
	public String greet() {
		return "Hellow World!- Welcome to Book store..";
	}
	

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable String id){
        return bookService.getBook(id);
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @PutMapping("/books/{id}")
    public void updateBook(@PathVariable String bookId, @RequestBody Book book) {
        bookService.updateBook(bookId, book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable String id) {
        bookService.deleteBook(id);
    }
}
