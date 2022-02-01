package com.example.tv_app;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Videos",
            "",
            "Category Two",
            "Category Three",
            "Category Four",
            "Category Five",
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }



    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "El planeta Tierra",
                "Caricatura",
                "Ciencia",
                "Race",
                "Coches y Choques"
        };

        String description = "Fusce id nisi turpis. Praesent viverra bibendum semper. "
                + "Donec tristique, orci sed semper lacinia, quam erat rhoncus massa, non congue tellus est "
                + "quis tellus. Sed mollis orci venenatis quam scelerisque accumsan. Curabitur a massa sit "
                + "amet mi accumsan mollis sed et magna. Vivamus sed aliquam risus. Nulla eget dolor in elit "
                + "facilisis mattis. Ut aliquet luctus lacus. Phasellus nec commodo erat. Praesent tempus id "
                + "lectus ac scelerisque. Maecenas pretium cursus lectus id volutpat.";
        String studio[] = {
                "Tierra", "Video 2", "Video 3", "Video 4", "Video 5"
        };
        String videoUrl[] = {
                "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_480_1_5MG.mp4",
                "https://sample-videos.com/video123/mp4/720/big_buck_bunny_720p_2mb.mp4",
                "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/TearsOfSteel.mp4",
                "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/VolkswagenGTIReview.mp4",
                "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WeAreGoingOnBullrun.mp4"
        };
        String bgImageUrl[] = {
                "https://img.freepik.com/vector-gratis/fondo-banner-abstracto-formas-rojas_1361-3348.jpg?size=626&ext=jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/bg.jpg",
                "https://m.media-amazon.com/images/M/MV5BMjA0NDYwOTc5Ml5BMl5BanBnXkFtZTcwOTc3MDgxOQ@@._V1_UY100_CR36,0,100,100_AL_.jpg",
                "https://image.shutterstock.com/image-photo/toronto-ontario-canada-november-22nd-600w-1567942591.jpg",
                "https://image.shutterstock.com/image-photo/minsk-belarus-september-13-2016-600w-496729612.jpg",
        };
        String cardImageUrl[] = {
                "https://ichef.bbci.co.uk/news/640/amz/worldservice/live/assets/images/2010/03/04/100304165450_earth2.jpg",
                "https://thumbs.dreamstime.com/b/traje-gordo-del-conejo-de-la-historieta-51213807.jpg",
                "https://m.media-amazon.com/images/M/MV5BMjA0NDYwOTc5Ml5BMl5BanBnXkFtZTcwOTc3MDgxOQ@@._V1_UY100_CR36,0,100,100_AL_.jpg",
                "https://image.shutterstock.com/image-photo/toronto-ontario-canada-november-22nd-600w-1567942591.jpg",
                "https://image.shutterstock.com/image-photo/minsk-belarus-september-13-2016-600w-496729612.jpg"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}