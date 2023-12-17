package com.example.bookstoremvc;

import com.example.bookstoremvc.dao.AuthorDao;
import com.example.bookstoremvc.dao.BookDao;
import com.example.bookstoremvc.dao.CategoryDao;
import com.example.bookstoremvc.entity.Author;
import com.example.bookstoremvc.entity.Book;
import com.example.bookstoremvc.entity.BookStatus;
import com.example.bookstoremvc.entity.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDate;

@SpringBootApplication
@RequiredArgsConstructor
public class BookStoreMvcApplication {
    private final CategoryDao categoryDao;
    private final AuthorDao authorDao;
    private final BookDao bookDao;
    @Bean @Transactional
    public ApplicationRunner runner(){
        return r -> {
            //for BestSellers
            Category category=new Category();
            category.setCategoryName("Programming");

            Author author1=new Author("Robert.C","Martin","martin@gmail.com",
                    LocalDate.of(1952,12,5),
                    "Uncle Bob is a living legend in the software industry " +
                            "and his work has had a profound impact on the way " +
                            "that software is developed today. He is a mentor to many " +
                            "and is always willing to share his knowledge and expertise." +
                            " He is a true inspiration to all software engineers.",
                    "uncle_bob");

            Book book1=new Book("Clean Code",40.5,LocalDate.of(2008,3,11),
                    "Pearson", BookStatus.BESTSELLERS,"clean_code");


            Category category2=new Category();
            category2.setCategoryName("Science");

            Author author2=new Author("Stephan","Hawking",
                    "stephan@gmail.com",LocalDate.of(1942,1,8),
                    "He was a theoretical physicist, cosmologist, and author" +
                            " who made significant contributions to " +
                            "our understanding of black holes and the Big Bang.",
                    "hawking");

            Book book2=new Book("A Brief History of Time",
                    18.99,LocalDate.of(1988,1,1),"Bantam Dell"
                    ,BookStatus.BESTSELLERS,
                    "history_of_time");

            Category category3=new Category();
            category3.setCategoryName("Programming");

            Author author3=new Author("Joshua","Bloch","bloch@gmail.com",
                    LocalDate.of(1961,8,28),
                    "a software engineer and author who was involved in " +
                            "the design and implementation of" +
                            " numerous Java platform features.","bloch");

            Book book3=new Book("Effective Java",55.2,LocalDate.of(2017,12,27),
                    "Addison-Wesley",
                    BookStatus.BESTSELLERS,
                    "effective_java");

          //Eh

            Category category4=new Category();
            category4.setCategoryName("Novel");

            Author author4=new Author("Thomas","Hardy","thomas@gmail.com",
                    LocalDate.of(1840,6,2),
                    "His novels are often characterized by their tragic plots and their exploration of themes such as love, loss, and fate.",
                    "hardy");

            Book book4=new Book("Far From the",32.5,LocalDate.of(1874,1,1),
                    "Collins",BookStatus.BESTSELLERS,"far");

            Author author5=new Author("Yasunari","Kawabata","kawabata@gmail.com",
                    LocalDate.of(1899,1,1),
                    "he soon developed his own unique style, which was characterized by its simplicity, its focus on the inner lives of his characters, and its use of symbolism.",
                    "kawabata");
            Book book5=new Book("Snow Country",
                    20.5,LocalDate.of(1948,1,1),
                    "Pole Star",BookStatus.BESTSELLERS,
                    "snow");


            Author author6=new Author("Charles","Dickens","charles@gmail.com",
                    LocalDate.of(1812,2,7),
                    "He is best known for his serialized novels, which were published in installments in magazines and journals." +
                            " His works are known for their humor, satire, and " +
                            "social commentary.","charles");
            Author author7=new Author("Jane","Austen","austen@gamil.com",
                    LocalDate.of(1775,12,16),
                    "She was a master of the social novel. Her novels provide a vivid and insightful portrait of English society in the early 19th century.","jane");

            Book book9=new Book("Pride and Prejudice",30.5,
                    LocalDate.of(2008,5,16),
                    "Amazon",BookStatus.RECOMMENDED,
                    "pride");

            Book book10=new Book("Emma",37.3,
                    LocalDate.of(2003,5,6),
                    "Amazon",BookStatus.RECOMMENDED,
                    "emma");

            Book book6 =new Book("David Copperfield",35.3,
                    LocalDate.of(1850,1,1),
                    "Amazon",BookStatus.RECOMMENDED,
                    "david");
            Book book7=new Book("Great Expectations",40.3,
                    LocalDate.of(1861,1,1),
                    "Amazon",
                    BookStatus.RECOMMENDED,
                    "great");

            Book book8=new Book("Oliver Twist",33.5,
                    LocalDate.of(1838,1,1),
                    "Sun",
                    BookStatus.RECOMMENDED,
                    "oliver");


            Author author8=new Author("Christopher","Nolan","thomas@gmail.com",
                    LocalDate.of(1840,6,2),
                    "Christopher Edward Nolan CBE is a British and American filmmaker. Known for his Hollywood blockbusters " +
                            "with complex storytelling, Nolan is considered a leading filmmaker of the 21st century." +
                            " His films have grossed $5 billion worldwide. ",
                    "christopher");

            Book book11=new Book("Inception",40.5,LocalDate.of(2008,3,11),
                    "Pearson", BookStatus.NEW,"inception");


            Book book12=new Book("Interstellar",40.5,LocalDate.of(2008,3,11),
                    "Pearson", BookStatus.NEW,"interstellar");

            Book book13=new Book("The Dark Knight",40.5,LocalDate.of(2008,3,11),
                    "Pearson", BookStatus.NEW,"the_dark_knight");



            Author author9=new Author("Robert","b","thomas@gmail.com",
                    LocalDate.of(1840,6,2),
                    "Rich Dad Poor Dad is a 1997 book written by Robert T. Kiyosaki and Sharon Lechter. It advocates" +
                            " the importance of financial literacy, financial independence and building wealth through investing " +
                            "in assets, real estate investing, starting and owning businesses, as well as increasing one's " +
                            "financial intelligence",
                    "robert");

            Book book14=new Book("21st_century",40.5,LocalDate.of(2008,3,11),
                    "Pearson", BookStatus.NEW,"21st_century");

            Book book15=new Book("Rich Dad Poor Dad",40.5,LocalDate.of(2008,3,11),
                    "Pearson", BookStatus.NEW,"richdad");



            category4.addBook(book6);

             category4.addBook(book7);
             category4.addBook(book8);
             category4.addBook(book9);
             category4.addBook(book10);

            category4.addBook(book11);
            category4.addBook(book12);
            category4.addBook(book13);
            category4.addBook(book14);
            category4.addBook(book15);


            author6.addBook(book6);//6
             author6.addBook(book7);
             author6.addBook(book8);
             author7.addBook(book9);//7
             author7.addBook(book10);
             author8.addBook(book11);//8
             author8.addBook(book12);
             author8.addBook(book13);
             author9.addBook(book14);//9
             author9.addBook(book15);

            category4.addBook(book5);
            author5.addBook(book5);

            category4.addBook(book4);
            author4.addBook(book4);

            category.addBook(book1);
            author1.addBook(book1);

            category2.addBook(book2);
            author2.addBook(book2);

            category3.addBook(book3);
            author3.addBook(book3);


            categoryDao.save(category);
            categoryDao.save(category2);
            categoryDao.save(category3);
            categoryDao.save(category4);

            authorDao.save(author1);
            authorDao.save(author2);
            authorDao.save(author3);
            authorDao.save(author4);
            authorDao.save(author5);
            authorDao.save(author6);
            authorDao.save(author7);
            authorDao.save(author8);
            authorDao.save(author9);

            bookDao.save(book1);
            bookDao.save(book2);
            bookDao.save(book3);
            bookDao.save(book4);
            bookDao.save(book5);
            bookDao.save(book6);
            bookDao.save(book7);
            bookDao.save(book8);
            bookDao.save(book9);
            bookDao.save(book10);
            bookDao.save(book11);
            bookDao.save(book12);
            bookDao.save(book13);
            bookDao.save(book14);
            bookDao.save(book15);


        };
    }

    public static void main(String[] args) {
        SpringApplication.run(BookStoreMvcApplication.class, args);
    }

}
