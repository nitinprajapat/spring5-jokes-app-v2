package flying.springframework.spring5jokesappv2.services.impl;

import flying.springframework.spring5jokesappv2.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes=new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
