package com.company;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;

public class SearchMap {
    public static void main(String[] args) {
        String origin = "Jalan A";
        String locationToSearch = "Kampus ABC";
        List<List<Route>> routes = Arrays.asList(
            Arrays.asList(
                new Route("Jalan A", "Jalan B", 3, 13, emptyList()),
                new Route("Jalan B", "Jalan C", 3, 13, emptyList()),
                new Route("Jalan C", "Kampus ABC", 4, 13, emptyList())
            ),
            Arrays.asList(
                new Route("Jalan A", "Jalan D", 3, 18, emptyList()),
                new Route("Jalan D", "Jalan E", 3, 18, emptyList()),
                new Route("Jalan E", "Kampus ABC", 3, 18, emptyList())
            ),
            Arrays.asList(
                new Route("Jalan A", "Jalan F", 2, 7, emptyList()),
                new Route("Jalan F", "Jalan G", 2, 7, emptyList()),
                new Route("Jalan G", "Kampus ABC", 3, 7, Arrays.asList(
                    "Kecelakaan"
                ))
            )
        );
        System.out.println(String.format("Origin: %s", origin));
        System.out.println(String.format("Destination: %s", locationToSearch));
        for (List<Route> route: routes) {
            System.out.println(Arrays.deepToString(new List[]{route}));
        }
    }
}

class Route {
    String from, to;
    int distanceInKiloMetres, averageTravelSpeed;
    List<String> recentEvents;

    public Route(String from, String to, int distanceInKiloMetres, int averageTravelSpeed, List<String> recentEvents) {
        this.from = from;
        this.to = to;
        this.distanceInKiloMetres = distanceInKiloMetres;
        this.averageTravelSpeed = averageTravelSpeed;
        this.recentEvents = recentEvents;
    }

    @Override
    public String toString() {
        return "Route{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", distanceInKiloMetres=" + distanceInKiloMetres +
                ", averageTravelSpeed=" + averageTravelSpeed +
                ", recentEvents=" + recentEvents +
                '}';
    }
}
