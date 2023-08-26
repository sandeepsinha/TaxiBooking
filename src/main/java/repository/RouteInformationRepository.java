package repository;

import com.google.gson.Gson;
import model.Routes;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;

public class RouteInformationRepository {
    public Routes loadRoutes() {
        try (Reader reader = new InputStreamReader(Objects.requireNonNull(this.getClass()
                .getResourceAsStream("/routes.json")))) {
            return new Gson().fromJson(reader, Routes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
