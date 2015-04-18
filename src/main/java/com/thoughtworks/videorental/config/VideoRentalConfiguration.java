package com.thoughtworks.videorental.config;

import com.thoughtworks.videorental.domain.ClassicMovie;
import com.thoughtworks.videorental.domain.Customer;
import com.thoughtworks.videorental.domain.Movie;
import com.thoughtworks.videorental.domain.NewMovie;
import com.thoughtworks.videorental.domain.repository.CustomerRepository;
import com.thoughtworks.videorental.domain.repository.MovieRepository;
import com.thoughtworks.videorental.repository.SetBasedCustomerRepository;
import com.thoughtworks.videorental.repository.SetBasedMovieRepository;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

@Configuration
@Order(0)
public class VideoRentalConfiguration {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public MovieRepository movieRepository() {
        final Movie avatar = new Movie("Avatar");
        final Movie upInTheAir = new Movie("Up In The Air");
        final Movie findingNemo = new Movie("Finding Nemo");
        final Movie classicMovie = new ClassicMovie("Race Gurram");
        final Movie sathya_murthi = new NewMovie("s/o sathya murthi");
        return new SetBasedMovieRepository(Arrays.asList(avatar, upInTheAir, findingNemo,sathya_murthi,classicMovie));
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public CustomerRepository customerRepository() {
        final Customer customer1 = new Customer("James Madison");
        final Customer customer2 = new Customer("Zackery Taylor");
        final Customer customer3 = new Customer("Benjamin Harrison");
        final Customer customer4 = new Customer("Anil Kumar Kodi");
        return new SetBasedCustomerRepository(Arrays.asList(customer1, customer2, customer3,customer4));
    }


}
