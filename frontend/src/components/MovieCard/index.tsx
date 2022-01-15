import MovieScore from "components/MovieScore";


function MovieCard() {
    const movie = {
        id: 1,
        image: "https://cdn.universoracionalista.org/wp-content/uploads/2014/08/10452321_653860148024109_3976360606392238652_n-696x392.jpg",
        title: "The Witcher",
        count: 2,
        score: 4.5
    };
    return (

        <div>
            <img className="dsmovie-movie-card-image" src={movie.image} alt={movie.title} />
            <div className="dsmovie-card-bottom-container">
                <h3>{movie.title}</h3>
                <MovieScore />
                <div className="btn btn-primary dsmovie-btn">Avaliar</div>
            </div>
        </div>
    );
}

export default MovieCard;

