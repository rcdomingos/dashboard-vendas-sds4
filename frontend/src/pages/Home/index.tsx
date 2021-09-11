import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Home = () => {
  return (
    <>
      <NavBar />
      <div className="container py-5">
        <h1 className="display-4 fw-bold">CSVendas</h1>
        <p className="lead">
          Analise o desempenho das suas vendas por diferentes perspectivas
        </p>
        <hr />
        <p className="col-md-8 fs-5">
          Esta aplicação consiste em exibir um dashboard a partir de dados
          fornecidos por um back end construído com Spring Boot.
        </p>
        <Link className="btn btn-primary btn-lg" to="dashboard">
          Acessar dashboard
        </Link>
      </div>
      <Footer />
    </>
  );
};

export default Home;
