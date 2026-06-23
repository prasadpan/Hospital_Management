<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid">

    <a class="navbar-brand" href="">
      <i class="fa-solid fa-house-chimney-medical"></i> HEALTH CARE
    </a>

    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
      data-bs-target="#navbarSupportedContent">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">

       
          <li class="nav-item">
            <a class="nav-link active" href="${pageContext.request.contextPath }/admin_login/">ADMIN</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" href="">DOCTOR</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" href="">APPOINTMENT</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" href="">USER</a>
          </li>


          <li class="nav-item">
            <a class="nav-link active" href="">
              BOOK APPOINTMENT
            </a>
          </li>

          <li class="nav-item">
            <a class="nav-link active" href="">
              VIEW APPOINTMENT
            </a>
          </li>

          <!-- DROPDOWN MUST BE INSIDE <li> -->
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button"
               data-bs-toggle="dropdown">
              <i class="fa-solid fa-circle-user"></i>
              NameOfUser
            </a>

            <ul class="dropdown-menu dropdown-menu-end">
              <li>
                <a class="dropdown-item" href="">
                  Change Password
                </a>
              </li>
              <li>
                <a class="dropdown-item" href="">
                  Logout
                </a>
              </li>
            </ul>
          </li>


      </ul>
    </div>
  </div>
</nav>