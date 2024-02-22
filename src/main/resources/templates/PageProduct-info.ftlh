<!DOCTYPE html>
<html>
<head>
    <title>ВИТРИНА-МАГАЗИН ИНФО</title>
</head>
<body>
<h1>ИНФОРМАЦИОННАЯ СТРАНИЦА</h1><hr>
<h4>ПОДРОБНО О ТОВАРЕ</h4>
<b>Название товара: </b>${PageProduct.title}<br>
<b>Описание товара: </b>${PageProduct.description}<br>
<b>Цена: </b>${PageProduct.price}<br>
<b>Город: </b>${PageProduct.city}<br>
<b>Автор: </b>${PageProduct.author}<br>
<b>Иное: </b>${PageProduct.something}<br>
<hr>
<form action="/product/delete/${PageProduct.id}" method="post">
    <input type="submit" value="Удалить товар"/>
</form>
</body>
</html>