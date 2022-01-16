import axios from "axios";
import MovieCard from "components/MovieCard";
import Pagination from "pages/pagination";
import { BASE_URL } from "utils/requests";


function Listing() {

axios.get(`${BASE_URL}/movies?size=5&page=3`).then(
    resposta =>{
        console.log(resposta.data);
    }
);


    return (
        <>
            <Pagination />
            <div className="container">
                <div className="row">
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                        <MovieCard />
                    </div>
                    
                   
                    
                </div>
            </div>


        </>
    );
}

export default Listing;