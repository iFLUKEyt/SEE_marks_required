function calculate() {
  const subject = document.getElementById("subject").value.trim();
  const tt1 = parseFloat(document.getElementById("tt1").value);
  const tt2 = parseFloat(document.getElementById("tt2").value);
  const assignment = parseFloat(document.getElementById("assignment").value);
  const totalAssignment = parseInt(document.getElementById("totalAssignment").value);

  if (!subject || isNaN(tt1) || isNaN(tt2) || isNaN(assignment)) {
    alert("Please fill in all fields correctly.");
    return;
  }

  let avgTest = ((tt1 + tt2) / 2) * 1.2;
  let finalAss = 0;
  if (totalAssignment === 20) {
    finalAss = assignment * 1.5;
  }
  else if (totalAssignment === 25) {
    finalAss = assignment * 1.2;
  }
  else if (totalAssignment === 30) {
    finalAss = assignment * 1.0;
  }
  else if (totalAssignment === 50) {
    finalAss = assignment * 0.6;
  }

  let ce = avgTest + finalAss;

  function seeRequired(goal) {
    const required = goal - ce;
    if (required <= 40 && required >= 0) {
      return (required * 2.5).toFixed(2) + " /100";
    } else {
      return "Not Possible";
    }
  }

  const row = `
    <tr>
      <td>${subject}</td>
      <td>${ce.toFixed(2)}</td>
      <td>${seeRequired(91)}</td>
      <td>${seeRequired(75)}</td>
      <td>${seeRequired(61)}</td>
      <td>${seeRequired(55)}</td>
    </tr>
  `;
  document.getElementById("resultsTable").innerHTML += row;

  document.getElementById("subject").value = "";
  document.getElementById("tt1").value = "";
  document.getElementById("tt2").value = "";
  document.getElementById("assignment").value = "";
}
