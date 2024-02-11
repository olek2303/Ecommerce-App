
# E-Commerce Spring App

E-Commerce Spring & Vue App. 


## Deployment

To deploy this project run

```bash
  mvn spring-boot:run
```

## Configuration
Configuration can be updated in application.properties or using environment variables.


## API Reference

#### Get all items

```http
  GET /api/items
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### add(num1, num2)

Takes two numbers and returns the sum.


## Authors

- [@olek2303](https://www.github.com/olek2303)


