package com.theironyard;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by zach on 6/21/16.
 */
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {
    List<Restaurant> findByRating(int rating);
    List<Restaurant> findByLocation(String location);
    List<Restaurant> findByUser(User user);

    @Query("SELECT r FROM Restaurant r WHERE r.location LIKE ?1%")
    List<Restaurant> searchLocation(String location);
}
