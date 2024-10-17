AJS.toInit(function () {
    const CLASS_RED = 'epam-button--red';
    const CLASS_GREEN = 'epam-button--green';
    const CLASS_BLUE = 'epam-button--blue';

    const buttons = document.getElementsByClassName('epam-button');

    for (let button of buttons) {
        button.addEventListener('click', () => {
            if (button.classList.contains(CLASS_RED)) {

                button.classList.remove(CLASS_RED);
                button.classList.add(CLASS_GREEN);

            } else if (button.classList.contains(CLASS_GREEN)) {

                button.classList.remove(CLASS_GREEN);
                button.classList.add(CLASS_BLUE);

            } else if (button.classList.contains(CLASS_BLUE)) {

                button.classList.remove(CLASS_BLUE);
                button.classList.add(CLASS_RED);

            }
        });
    }
});
