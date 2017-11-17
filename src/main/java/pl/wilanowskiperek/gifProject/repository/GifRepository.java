package pl.wilanowskiperek.gifProject.repository;

import org.springframework.stereotype.Repository;
import pl.wilanowskiperek.gifProject.model.Gif;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GifRepository {

    private List<Gif> allGifs = new ArrayList<>();




}
