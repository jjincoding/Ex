package calculator.ch08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
	Map<String, Product> products = new HashMap<>();
	
	public ProductService() {
		Product p = new Product("101", "애플 아이폰 14", "애플", 10000, "2022.10.10");
		products.put("101", p);
		p = new Product("102", "삼성 갤럭시", "삼성", 10000, "2022.10.11");
		products.put("102", p);
		p = new Product("103", "삼성 플립", "삼성", 10000, "2022.10.12");
		products.put("103", p);
	}
	
	public List<Product> findAll(){
		return new ArrayList<>(products.values());
	}
	
	public Product find(String id) {
		return products.get(id);
	}
}
