<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

<%@ include file="./component/allcss.jsp" %>

<style type="text/css">
.paint-card {
  box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>

<%@ include file="./component/navbar.jsp" %>

  <div id="carouselExampleIndicators" class="carousel slide"
    data-bs-ride="carousel">
    <div class="carousel-indicators">
      <button type="button" data-bs-target="#carouselExampleIndicators"
        data-bs-slide-to="0" class="active" aria-current="true"
        aria-label="Slide 1"></button>
      <button type="button" data-bs-target="#carouselExampleIndicators"
        data-bs-slide-to="1" aria-label="Slide 2"></button>
      <button type="button" data-bs-target="#carouselExampleIndicators"
        data-bs-slide-to="2" aria-label="Slide 3"></button>
    </div>
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img src="<c:url value='/resources/images/hospital1.jpg'/>" class="d-block w-100" alt="..." height="600px">
      </div>
      <div class="carousel-item">
        <img src="<c:url value='/resources/images/hospital1.jpg'/>" class="d-block w-100" alt="..." height="600px">
      </div>
      <div class="carousel-item">
        <img src="<c:url value='/resources/images/hospital2.jpg'/>" class="d-block w-100" alt="..." height="600px">
      </div>
      <div class="carousel-item">
        <img src="<c:url value='/resources/images/hospital3.jpg'/>" class="d-block w-100" alt="..." height="600px">
      </div>
    </div>
    <button class="carousel-control-prev" type="button"
      data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
        class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button"
      data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span> <span
        class="visually-hidden">Next</span>
    </button>
  </div>

  <div class="container p-3">
    <p class="text-center fs-2 fw-bold">Key Features of our Hospital</p>

    <div class="row">
      <div class="col-md-8 p-5">
        <div class="row">
          <div class="col-md-6">
            <div class="card paint-card">
              <div class="card-body">
                <p class="fs-5 fw-bold">100% Safety</p>
                <p>Safety being the primary concern in a hospital set up,
                  such as Medicinal, Clinical, Infrastructural, Equipment,
                  Physical, Social and Weather related Safety. It covers not only
                  the patients but also the staff members and the visitors..</p>
              </div>
            </div>
          </div>
          <div class="col-md-6">
            <div class="card paint-card">
              <div class="card-body">
                <p class="fs-5 fw-bold">Clean Environment</p>
                <p>hospital environmental hygiene will benefit public health
                  by lowering rates of healthcare-associated infections, reducing
                  antimicrobial resistance, and protecting hospital staff as well
                  as the larger environment.t</p>
              </div>
            </div>
          </div>
          <div class="col-md-6 mt-2">
            <div class="card paint-card">
              <div class="card-body">
                <p class="fs-5 fw-bold">Friendly Doctors</p>
                <p>The success of treatment can be greatly impacted by the
                  doctor-patient relationship.doctor-patient relationship
                  includes competence and communication, typically there is
                  better adherence to treatment.</p>
              </div>
            </div>
          </div>
          <div class="col-md-6 mt-2">
            <div class="card paint-card">
              <div class="card-body">
                <p class="fs-5 fw-bold">Medical Research</p>
                <p>Hospitals with Best Research Facilities.Both
                  international and national guidelines adhered to for research
                  activities,Hi-tech therapeutic and diagnostic
                  facilities.Numerous members awarded at national level</p>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="col-md-4">
        <img alt="" src="<c:url value='/resources/images/hospital5.jpg'/>" class="mt-5"
          style="width: 500px;">
      </div>

    </div>
  </div>

  <hr>

  <div class="container p-2">
    <p class="text-center fs-2 fw-bold">Our Team</p>

    <div class="row">
      <div class="col-md-3">
        <div class="card paint-card">
          <div class="card-body text-center">
            <img src="<c:url value='/resources/images/hospital6.jpg'/>" width="250px" height="300px">
            <p class="fw-bold fs-5">Dr.ELLIS G REEF</p>
            <p class="fs-7 fw-bold">(CEO & Chairman)</p>
          </div>
        </div>
      </div>

      <div class="col-md-3">
        <div class="card paint-card">
          <div class="card-body text-center">
            <img src="<c:url value='/resources/images/hospital8.avif'/>"width="250px" height="300px">
            <p class="fw-bold fs-5">Dr.ELSA GRACE GIARDINA</p>
            <p class="fs-7 fw-bold">(Chief Doctor)</p>
          </div>
        </div>
      </div>

      <div class="col-md-3">
        <div class="card paint-card">
          <div class="card-body text-center">
            <img src="<c:url value='/resources/images/hospital7.webp'/>" width="250px" height="300px">
            <p class="fw-bold fs-5">Dr.KUNAL N BODIWALA</p>
            <p class="fs-7 fw-bold">(Chief Doctor)</p>
          </div>
        </div>
      </div>

      <div class="col-md-3">
        <div class="card paint-card">
          <div class="card-body text-center">
            <img src="<c:url value='/resources/images/hospital9.jfif'/>" width="250px" height="300px">
            <p class="fw-bold fs-5">Dr.MARY ANN PEBERDY</p>
            <p class="fs-7 fw-bold">(Chief Doctor)</p>
          </div>
        </div>
      </div>

    </div>

  </div>

<%@ include file="./component/footer.jsp" %>
</body>
</html>
