import { useEffect, useState } from "react"
import ProductList from "./ProductList";

function App() {

  const [products, setProducts] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/products")
    .then(response => response.json())
    .then(data => {
      setProducts(data);
      console.log("Fetched all products successfully");
    })
    .catch(error => console.error("Error in fetching all products: ", error))
  }, []);

  return (
    <div className="container mt-5 mb-5">
      <div>
        {products.length ? (
          <ProductList products={products}/>
        ) : (
          <p>No products found</p>
        )}
      </div>
    </div>
  )
}

export default App
