equation = "2x + 4"
equation = equation.replace(" ", "");
terms = equation.split("+");

step_size = 0.5
bounds = (0, 10)
x = bounds[0]
y = 0
for i in range(int((bounds[1] - bounds[0]) / step_size) + 1):
    print(x)
    # for t in terms:
        

    x += step_size