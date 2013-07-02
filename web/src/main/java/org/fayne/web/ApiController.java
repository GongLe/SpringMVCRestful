package org.fayne.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * restful demo
 * User: Gongle
 * Date: 13-7-1
 * url:
 * /api/{id} HTTP GET > get id==1
 * /api/{id} HTTP DELETE > delete id==1
 * /api/{id} HTTP PUT > update id==1
 * /api      HTTP POST > create object
 * /api      HTTP GET > get list page
 */
@Controller
@RequestMapping("/api")
public class ApiController {
    public static final String LIST = "redirect:/api";

    /**
     * list*
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list(ModelMap model) {
        System.out.println("api list method=get ");
        return new ModelAndView("/api/list");
    }

    /**
     * get one*
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ModelAndView get(ModelMap model, @PathVariable String id) {
        System.out.println("api get method=get:" + id);
        return new ModelAndView("/api/detail");
    }

    /**
     * delete*
     */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ModelAndView delete(ModelMap model, @PathVariable String id) {
        System.out.println("api delete method=delete:" + id);
        return new ModelAndView(LIST);
    }

    /**
     * update*
     */
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ModelAndView update(ModelMap model, @PathVariable String id) {
        System.out.println("api update  method=put :" + id);
        model.addAttribute("id", id);
        model.clear();
        model.addAttribute("clear", "hasClear");
        return new ModelAndView(LIST);
    }

    /**
     * create*
     */
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView create(ModelMap model) {
        System.out.println("api create one method=post  ");
        model.clear();
        return new ModelAndView(LIST);
    }
}
