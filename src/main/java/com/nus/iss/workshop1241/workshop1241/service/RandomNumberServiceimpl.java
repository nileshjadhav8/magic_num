package com.nus.iss.workshop1241.workshop1241.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
@Service
public class RandomNumberServiceimpl implements RandomnumberService {

    @Override
    public List<Integer> generateRandomNumbers(int number) {
        return new Random().ints(1, 30).distinct().limit(number).boxed().collect(Collectors.toList());
    }

}
