<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="${pageContext.request.contextPath}/admin/index"><i
      class="fas fa-clinic-medical"></i> HEALTH CARE</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
      data-bs-target="#navbarSupportedContent"
      aria-controls="navbarSupportedContent" aria-expanded="false"
      aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">

        <li class="nav-item"><a class="nav-link active" href="${pageContext.request.contextPath}/admin/index">HOME</a></li>
        <li class="nav-item"><a class="nav-link active" href="${pageContext.request.contextPath}/admin/add_doctor">ADD DOCTOR</a></li>
        <li class="nav-item"><a class="nav-link active" href="${pageContext.request.contextPath}/admin/view_doctor">VIEW DOCTOR</a></li>
        <li class="nav-item"><a class="nav-link active" href="${pageContext.request.contextPath}/admin/patient">PATIENT</a></li>


      </ul>

      <form class="d-flex">
        <div class="dropdown">
          <button class="btn btn-light dropdown-toggle" type="button"
            id="dropdownMenuButton1" data-bs-toggle="dropdown"
            aria-expanded="false">Admin</button>
          <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/adminLogout">Logout</a></li>
          </ul>
        </div>
      </form>
    </div>
  </div>
</nav>
