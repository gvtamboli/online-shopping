 <h1 class="my-4">Shop Name</h1>
<div class="list-group">
	<c:forEach items="${listProducts}" var="element">
	 <a href="#" class="list-group-item">${element.name}</a>
	</c:forEach>
</div>