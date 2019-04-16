import spark.ModelAndView;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        port(6060);

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            model.put("template", "templates/squads-form.vtl");

            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/categories", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String size = request.queryParams("maximumsize");
            String reason = request.queryParams("reason");
            Squad newSquad = new Squad(name, Integer.parseInt(size), reason);

            model.put("squad", newSquad);
            model.put("template", "templates/squad-success.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/squads", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            model.put("template", "templates/hero-form.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());


        get("/squads", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("categories", Squad.all());
            model.put("template", "templates/Squad.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());


    }

}


