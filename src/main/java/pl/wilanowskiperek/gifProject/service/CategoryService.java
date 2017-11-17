package pl.wilanowskiperek.gifProject.service;

import org.codehaus.groovy.runtime.powerassert.SourceText;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wilanowskiperek.gifProject.model.Category;
import pl.wilanowskiperek.gifProject.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {

    private static final Logger LOG = LoggerFactory.getLogger(CategoryService.class);

    @Autowired
    CategoryRepository categoryRepository;

    public void save(Category category){
        LOG.info("User is saving artcile={}", category);
        System.out.println("### User is saving category=" + category);
        categoryRepository.save(category);
    }

}
