<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="pr-0 hide-on-med-and-down animate fadeLeft">
    <div class="card">
        <div class="card-content">
            <span class="card-title">Categories</span>
            <hr class="p-0 mb-10" style="border: solid 1px #cf6818 !important">
            <ul class="collapsible categories-collapsible"  style="box-shadow: none !important; border:0 !important">
                <c:forEach var="categorie" items="${listCategories}">
                    <li>
                        <div class="collapsible-header"  tabindex="0">${categorie.key.getNomCategorie()}<i class="material-icons">
                                keyboard_arrow_right </i></div>
                        <div class="collapsible-body" style="display: none;">
                            <c:forEach var="ssCategorie" items="${categorie.value}">
                                <p>${ssCategorie.getNomSousCategorie()}</p>
                            </c:forEach>
                        </div>
                    </li>
                </c:forEach>
            </ul>
            <span class="card-title">Prix</span>
            <hr>
            <p class="range-field">
                <input type="range" id="test5" min="0" max="100"><span class="thumb"><span class="value"></span></span>
            </p>

        </div>
    </div>
</div>