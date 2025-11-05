import { useEffect, useState } from "react"

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
    <div>
      
    </div>
  )
}

export default App
