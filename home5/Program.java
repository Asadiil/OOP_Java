package home5;

import home5.models.Table;
import home5.models.TableModel;
import home5.presenters.BookingPresenter;
import home5.presenters.Model;
import home5.presenters.View;
import home5.views.BookingView;

import java.util.ArrayList;
import java.util.Date;

public class Program {

    /**
     * TODO: Домашняя работа
     *  метод changeReservationTable должен заработать!!!
     * @param args
     */
    public static void main(String[] args) {

        View view = new BookingView();
        Model model = new TableModel();

        BookingPresenter bookingPresenter = new BookingPresenter(view, model);
        bookingPresenter.showTables();

        view.reservationTable(new Date(), 3, "Станислав");



        //view.changeReservationTable(1001, new Date(), 4, "Станислав");

    }

}
