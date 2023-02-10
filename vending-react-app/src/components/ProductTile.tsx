import "./ProductTile.css";

const ProductTile = () => {

    const colorList = ["#721817", "#FA9F42", "#2B4162", "#0B6E4F"]
    function getRandomColor() {
        return colorList[Math.floor(Math.random()*colorList.length)];
    } 

    return (
        <div className="product-tile" style={{backgroundColor: getRandomColor()}}>
            <div className="product-image">
                <p> Image </p>
            </div>
            <div className="product-name">
                <p> Name </p>
            </div>
            <div className="product-price">
                <p> Price </p>
            </div>
        </div>
        
    )
};

export default ProductTile;

